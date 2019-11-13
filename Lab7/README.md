# Visitor

```java
interface Visitor {
 	void visit(Fisier f);
 	void visit(Director d);
}

abstract class Repository {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public abstract void accept(Cat v);
	public abstract void accept(Ls v);
}

class Fisier extends Repository {
	public void accept(Cat v) {
		v.visit(this);
	}
	
	public void accept(Ls v) {
		v.visit(this);
	}
}

class Directory extends Repository {
	private List<Repository> entries = new ArrayList<>();
	
	public void addEntry(Repository entry) {
		entries.add(entry);
	}
	
	public List<Repository> getEntries() {
		return this.entries;
	}
	
	public void accept(Cat v) {
		v.visit(this);
	}
	
	public void accept(Ls v) {
		v.visit(this);
	}
}

class Cat implements Visitor {
	public void visit(Fisier f) {
		// reading from file and show content
	}
	
	public void visit(Director f) {
		System.err.println("Cannot apply cat on a directory");
	}
}

class Ls implements Visitor {
	public void visit(Fisier f) {
		System.out.println(f.getName());
	}
	
	public void visit(Director f) {
		System.out.println(f.getName());
		for (var entry: f.getEntries()) {
			System.out.println(entry.getName());
		}
	}
}

```

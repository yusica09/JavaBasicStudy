package days14;

public interface IDBConn {

	public abstract void open();
	void close();

	// CRUD
	void select();
	void insert();
	void update();
	void delete();

}

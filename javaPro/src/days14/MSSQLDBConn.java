package days14;

public class MSSQLDBConn implements IDBConn{

	@Override
	public void open() {
		System.out.println("> MSSQL DB 연결하는 구현 코딩..");		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		System.out.println("> MSSQL DB 조회하는 구현 코딩..");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	/*
	void connection() {
		//asdfsadf
	}
	 */

}


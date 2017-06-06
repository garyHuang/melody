package hp.edu.controller.view;

public class DataTableResult {

	private Integer start = 1;

	private Integer length = 10;

	private int draw = 1;

	public int getDraw() {
		return draw;
	}

	public Integer getStart() {
		start = start / length ;  
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void setDraw(int draw) {
		draw = 0 == draw ? 1 : draw;
		this.draw = draw;
	}

	private long recordsTotal;
	
	private long recordsFiltered;

	private Object aaData;

	public long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public Object getAaData() {
		return aaData;
	}

	public void setAaData(Object aaData) {
		this.aaData = aaData;
	}
}

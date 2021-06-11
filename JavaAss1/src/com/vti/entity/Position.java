package com.vti.entity;

public class Position {
	private int positionId;
	private PositionName positionName;
	
	public Position() {
		
	}
	
	public Position(PositionName positionName) {
		super();
		this.positionName = positionName;
	}
	
	

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public PositionName getPositionName() {
		return positionName;
	}

	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", positionName=" + positionName + "]";
	}
	
}

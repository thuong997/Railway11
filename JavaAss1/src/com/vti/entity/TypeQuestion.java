package com.vti.entity;

public class TypeQuestion {
	int typeId;
	enums typeName;
	
	
	
	public int getTypeId() {
		return typeId;
	}



	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}



	public enums getTypeName() {
		return typeName;
	}



	public void setTypeName(enums typeName) {
		this.typeName = typeName;
	}



	@Override
	public String toString() {
		return "TypeQuestion [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	
}

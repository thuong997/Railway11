package com.vti.frontend;

import com.vti.backend.QLCB;

public class ArrayList {

	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		qlcb.addNewCanBo();
		qlcb.addNewCanBo();	
		qlcb.addNewCanBo();	
		qlcb.showInfoDsCanBo();
		qlcb.searchByName();
		qlcb.deleteByName();
		qlcb.showInfoDsCanBo();

	}

}

package kr.ac.kopo.practice11;

import kr.ac.kopo.practice11.util.CommonUtil;

public class CallTest extends CommonUtil{

	int i = 1;
    CallTest(){
    	this.i = 2;
    }
    public static void main(String[] args) {
		CommonUtil o = new CommonUtil();
		CallTest ct = new CallTest();
		ct.i += o.am();
		ct.i += o.bm();
		ct.i += o.cm();
		ct.i += o.dm();
		System.out.println(ct.i);
	}
}

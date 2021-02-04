package com.android.example.module06_module025_module1;

public class ClassAAB {
	private 	com.android.example.module06_module025_module2.ClassAAC instance_var_1_0 = new com.android.example.module06_module025_module2.ClassAAC();
	private 	com.android.example.module06_module109_module1.ClassAAB instance_var_1_1 = new com.android.example.module06_module109_module1.ClassAAB();

	public void method0(
		com.android.example.module06_module109_module1.ClassAAH param0,
		com.android.example.module06_module025_module2.ClassAAA param1,
		com.android.example.module06_module109_module1.ClassAAG param2) throws Throwable {
		param0.method0("SomeString", "SomeString", "SomeString");

		param0.method2("SomeString", "SomeString", "SomeString", "SomeString");

	}

	public void method1(
		com.android.example.module06_module109_module1.ClassAAA param0,
		com.android.example.module06_module025_module2.ClassAAA param1) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.method2("SomeString", "SomeString");

			} catch(Throwable e) { } // ignore
		});
	}
}

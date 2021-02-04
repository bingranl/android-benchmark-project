package com.android.example.module06_module212;

public class ClassAAJ {
	private 	com.android.example.module06_module340_module3.ClassAAB instance_var_1_0 = new com.android.example.module06_module340_module3.ClassAAB();
	private 	com.android.example.module06_module340_module3.ClassAAA instance_var_1_1 = new com.android.example.module06_module340_module3.ClassAAA();
	private 	com.android.example.module06_module340_module3.ClassAAJ instance_var_1_2 = new com.android.example.module06_module340_module3.ClassAAJ();
	private 	com.android.example.module06_module340_module3.ClassAAB instance_var_1_3 = new com.android.example.module06_module340_module3.ClassAAB();
	private 	com.android.example.module06_module340_module3.ClassAAA instance_var_1_4 = new com.android.example.module06_module340_module3.ClassAAA();

	public void method0(
		com.android.example.module06_module340_module3.ClassAAB param0,
		com.android.example.module06_module340_module3.ClassAAG param1,
		com.android.example.module06_module340_module3.ClassAAI param2,
		com.android.example.module06_module340_module3.ClassAAI param3) throws Throwable {
		param0.method2("SomeString", "SomeString");

		androidx.core.os.CancellationSignal local_var_2_4 = new androidx.core.os.CancellationSignal();
		local_var_2_4.throwIfCanceled();

	}

	public void method1(
		com.android.example.module06_module340_module3.ClassAAE param0) throws Throwable {
		androidx.core.os.CancellationSignal local_var_2_1 = new androidx.core.os.CancellationSignal();
		local_var_2_1.cancel();

		androidx.core.os.CancellationSignal local_var_2_2 = new androidx.core.os.CancellationSignal();
		local_var_2_2.throwIfCanceled();

		androidx.lifecycle.MethodCallsLogger local_var_2_3 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_3.approveCall("SomeString", 67);

		androidx.core.os.CancellationSignal local_var_2_4 = new androidx.core.os.CancellationSignal();
		local_var_2_4.cancel();

	}

	public void method2(
		com.android.example.module06_module340_module3.ClassAAG param0,
		com.android.example.module06_module340_module3.ClassAAI param1,
		com.android.example.module06_module340_module3.ClassAAG param2) throws Throwable {
	}
}

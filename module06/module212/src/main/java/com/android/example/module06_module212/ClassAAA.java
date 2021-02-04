package com.android.example.module06_module212;

public class ClassAAA {
	private 	com.android.example.module06_module340_module3.ClassAAI instance_var_1_0 = new com.android.example.module06_module340_module3.ClassAAI();
	private 	com.android.example.module06_module340_module3.ClassAAC instance_var_1_1 = new com.android.example.module06_module340_module3.ClassAAC();

	public void method0(
		com.android.example.module06_module340_module3.ClassAAC param0) throws Throwable {
		androidx.lifecycle.MethodCallsLogger local_var_2_1 = new androidx.lifecycle.MethodCallsLogger();
		local_var_2_1.approveCall("SomeString", 23);

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString");

	}

	public void method1(
		com.android.example.module06_module340_module3.ClassAAE param0) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.method1("SomeString", "SomeString", "SomeString", "SomeString");

		} else {
			androidx.lifecycle.MethodCallsLogger local_var_3_0 = new androidx.lifecycle.MethodCallsLogger();
			local_var_3_0.approveCall("SomeString", 86);

		}
		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

		androidx.core.os.CancellationSignal local_var_2_2 = new androidx.core.os.CancellationSignal();
		local_var_2_2.throwIfCanceled();

	}
}

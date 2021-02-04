package com.android.example.module06_module257_module2;

public class ClassAAE {
	private 	com.android.example.module06_module257_module3.ClassAAI instance_var_1_0 = new com.android.example.module06_module257_module3.ClassAAI();
	private 	com.android.example.module06_module257_module3.ClassAAJ instance_var_1_1 = new com.android.example.module06_module257_module3.ClassAAJ();
	private 	com.android.example.module06_module257_module1.ClassAAE instance_var_1_2 = new com.android.example.module06_module257_module1.ClassAAE();
	private 	com.android.example.module06_module257_module1.ClassAAA instance_var_1_3 = new com.android.example.module06_module257_module1.ClassAAA();

	public void method0(
		com.android.example.module06_module257_module1.ClassAAA param0,
		com.android.example.module06_module257_module1.ClassAAA param1,
		com.android.example.module06_module257_module3.ClassAAB param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertNotSubscribed();

		for (int iAb = 0; iAb < 6; iAb++) {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.isCancelled();

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_1 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_1.request(-584143017l);

			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_2 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_2.onComplete();

		}
		io.reactivex.internal.util.LinkedArrayList local_var_2_5 = new io.reactivex.internal.util.LinkedArrayList(4);
		local_var_2_5.add(new java.lang.Object());

	}

	public void method1(
		com.android.example.module06_module257_module1.ClassAAC param0,
		com.android.example.module06_module257_module1.ClassAAJ param1,
		com.android.example.module06_module257_module1.ClassAAC param2) throws Throwable {
		io.reactivex.observers.TestObserver<Object> local_var_2_3 = new io.reactivex.observers.TestObserver();
		local_var_2_3.onComplete();

		param0.method1(new com.android.example.module06_module257_module3.ClassAAF(), new com.android.example.module06_module257_module3.ClassAAB());

	}

	public void method2(
		com.android.example.module06_module257_module1.ClassAAJ param0,
		com.android.example.module06_module257_module3.ClassAAJ param1,
		com.android.example.module06_module257_module3.ClassAAF param2,
		com.android.example.module06_module257_module1.ClassAAF param3) throws Throwable {
		param0.method4(new com.android.example.module06_module257_module3.ClassAAH(), new com.android.example.module06_module257_module3.ClassAAF(), new com.android.example.module06_module257_module3.ClassAAC(), new com.android.example.module06_module257_module3.ClassAAH());

		param0.method3(new com.android.example.module06_module257_module3.ClassAAB());

		param0.method4(new com.android.example.module06_module257_module3.ClassAAH(), new com.android.example.module06_module257_module3.ClassAAF(), new com.android.example.module06_module257_module3.ClassAAC(), new com.android.example.module06_module257_module3.ClassAAH());

		io.reactivex.schedulers.TestScheduler local_var_2_4 = new io.reactivex.schedulers.TestScheduler();
		local_var_2_4.createWorker();

	}
}

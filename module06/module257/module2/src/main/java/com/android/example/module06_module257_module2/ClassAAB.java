package com.android.example.module06_module257_module2;

public class ClassAAB {
	private 	com.android.example.module06_module257_module3.ClassAAG instance_var_1_0 = new com.android.example.module06_module257_module3.ClassAAG();
	private 	com.android.example.module06_module257_module3.ClassAAH instance_var_1_1 = new com.android.example.module06_module257_module3.ClassAAH();

	public void method0(
		com.android.example.module06_module257_module3.ClassAAI param0) throws Throwable {
		for (int iAb = 0; iAb < 3; iAb++) {
			if (new java.lang.Object().equals(new java.lang.Object())) {
				if (new java.lang.Object().equals(new java.lang.Object())) {
					param0.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.disposables.SerialDisposable());

				} else {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_5_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_5_0.assertSubscribed();

				}
			}
			param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.schedulers.SingleScheduler(), new io.reactivex.internal.disposables.ListCompositeDisposable());

			io.reactivex.observers.TestObserver<Object> local_var_3_0 = new io.reactivex.observers.TestObserver();
			local_var_3_0.dispose();

		}
	}

	public void method1(
		com.android.example.module06_module257_module1.ClassAAG param0,
		com.android.example.module06_module257_module1.ClassAAG param1,
		com.android.example.module06_module257_module1.ClassAAA param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.requestMore(-195139379l);

	}

	public void method2(
		com.android.example.module06_module257_module3.ClassAAD param0,
		com.android.example.module06_module257_module1.ClassAAI param1) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_2.clear();

		param0.method0(new io.reactivex.subscribers.TestSubscriber());

	}

	public void method3(
		com.android.example.module06_module257_module1.ClassAAD param0) throws Throwable {
		param0.method2(new com.android.example.module06_module257_module3.ClassAAC(), new com.android.example.module06_module257_module3.ClassAAF(), new com.android.example.module06_module257_module3.ClassAAB());

		io.reactivex.schedulers.TestScheduler local_var_2_1 = new io.reactivex.schedulers.TestScheduler();
		local_var_2_1.triggerActions();

		param0.method1(new com.android.example.module06_module257_module3.ClassAAJ());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

	}

	public void method4(
		com.android.example.module06_module257_module1.ClassAAH param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.cancel();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.onNext(new java.lang.Object());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.request(-1772727960l);

	}
}

package com.android.example.module06_module257_module2;

public class ClassAAH {
	private 	com.android.example.module06_module257_module1.ClassAAG instance_var_1_0 = new com.android.example.module06_module257_module1.ClassAAG();
	private 	com.android.example.module06_module257_module3.ClassAAG instance_var_1_1 = new com.android.example.module06_module257_module3.ClassAAG();
	private 	com.android.example.module06_module257_module1.ClassAAJ instance_var_1_2 = new com.android.example.module06_module257_module1.ClassAAJ();
	private 	com.android.example.module06_module257_module3.ClassAAE instance_var_1_3 = new com.android.example.module06_module257_module3.ClassAAE();
	private 	com.android.example.module06_module257_module3.ClassAAD instance_var_1_4 = new com.android.example.module06_module257_module3.ClassAAD();

	public void method0(
		com.android.example.module06_module257_module1.ClassAAI param0) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.assertSubscribed();

			} catch(Throwable e) { } // ignore
		});
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertSubscribed();

	}

	public void method1(
		com.android.example.module06_module257_module1.ClassAAJ param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.requestMore(-585150626l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.hasSubscription();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.hasSubscription();

		param0.method4(new com.android.example.module06_module257_module3.ClassAAH(), new com.android.example.module06_module257_module3.ClassAAF(), new com.android.example.module06_module257_module3.ClassAAC(), new com.android.example.module06_module257_module3.ClassAAH());

	}

	public void method2(
		com.android.example.module06_module257_module3.ClassAAG param0,
		com.android.example.module06_module257_module1.ClassAAD param1,
		com.android.example.module06_module257_module3.ClassAAG param2) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_3 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_3.dispose();

		param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.disposables.SerialDisposable(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.request(-1635925992l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.onNext(new java.lang.Object());

	}
}

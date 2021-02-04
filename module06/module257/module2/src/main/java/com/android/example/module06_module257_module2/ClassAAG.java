package com.android.example.module06_module257_module2;

public class ClassAAG {
	private 	com.android.example.module06_module257_module3.ClassAAC instance_var_1_0 = new com.android.example.module06_module257_module3.ClassAAC();
	private 	com.android.example.module06_module257_module1.ClassAAH instance_var_1_1 = new com.android.example.module06_module257_module1.ClassAAH();
	private 	com.android.example.module06_module257_module3.ClassAAD instance_var_1_2 = new com.android.example.module06_module257_module3.ClassAAD();
	private 	com.android.example.module06_module257_module3.ClassAAI instance_var_1_3 = new com.android.example.module06_module257_module3.ClassAAI();
	private 	com.android.example.module06_module257_module1.ClassAAE instance_var_1_4 = new com.android.example.module06_module257_module1.ClassAAE();

	public void method0(
		com.android.example.module06_module257_module3.ClassAAD param0,
		com.android.example.module06_module257_module3.ClassAAG param1,
		com.android.example.module06_module257_module1.ClassAAF param2) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.onError(new java.lang.Throwable());

			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		com.android.example.module06_module257_module3.ClassAAE param0,
		com.android.example.module06_module257_module3.ClassAAA param1,
		com.android.example.module06_module257_module3.ClassAAE param2) throws Throwable {
		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.method2(new io.reactivex.schedulers.TestScheduler(), new io.reactivex.subscribers.TestSubscriber());

		} else {
			io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
			local_var_3_0.isCancelled();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.requestMore(-95504259l);

		param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

	}

	public void method2(
		com.android.example.module06_module257_module3.ClassAAC param0) throws Throwable {
		param0.method1(new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.internal.disposables.ListCompositeDisposable());

	}

	public void method3(
		com.android.example.module06_module257_module3.ClassAAH param0,
		com.android.example.module06_module257_module1.ClassAAC param1,
		com.android.example.module06_module257_module3.ClassAAA param2,
		com.android.example.module06_module257_module3.ClassAAE param3) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_4 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_4.isDisposed();

		param0.method1(new io.reactivex.subscribers.TestSubscriber());

		param0.method2(new io.reactivex.internal.disposables.ListCompositeDisposable(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.request(496219867l);

	}
}

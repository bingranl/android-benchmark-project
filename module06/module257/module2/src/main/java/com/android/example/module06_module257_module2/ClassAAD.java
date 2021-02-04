package com.android.example.module06_module257_module2;

public class ClassAAD {
	private 	com.android.example.module06_module257_module1.ClassAAB instance_var_1_0 = new com.android.example.module06_module257_module1.ClassAAB();
	private 	com.android.example.module06_module257_module3.ClassAAF instance_var_1_1 = new com.android.example.module06_module257_module3.ClassAAF();
	private 	com.android.example.module06_module257_module1.ClassAAE instance_var_1_2 = new com.android.example.module06_module257_module1.ClassAAE();
	private 	com.android.example.module06_module257_module3.ClassAAB instance_var_1_3 = new com.android.example.module06_module257_module3.ClassAAB();

	public void method0(
		com.android.example.module06_module257_module3.ClassAAA param0,
		com.android.example.module06_module257_module3.ClassAAH param1,
		com.android.example.module06_module257_module3.ClassAAC param2) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				for (int iAb = 0; iAb < 5; iAb++) {
					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_0.hasSubscription();

					io.reactivex.internal.schedulers.SingleScheduler local_var_4_1 = new io.reactivex.internal.schedulers.SingleScheduler();
					local_var_4_1.shutdown();

					io.reactivex.subscribers.TestSubscriber<Object> local_var_4_2 = new io.reactivex.subscribers.TestSubscriber();
					local_var_4_2.onNext(new java.lang.Object());

					local_var_4_0.dispose();

				}
				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.onNext(new java.lang.Object());

			} catch(Throwable e) { } // ignore
		});
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.request(-840993338l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.request(-786345230l);

	}

	public void method1(
		com.android.example.module06_module257_module3.ClassAAH param0,
		com.android.example.module06_module257_module1.ClassAAB param1,
		com.android.example.module06_module257_module3.ClassAAF param2,
		com.android.example.module06_module257_module1.ClassAAG param3) throws Throwable {
	}

	public void method2(
		com.android.example.module06_module257_module1.ClassAAA param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.onNext(new java.lang.Object());

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_2.clear();

	}

	public void method3(
		com.android.example.module06_module257_module3.ClassAAB param0,
		com.android.example.module06_module257_module3.ClassAAB param1,
		com.android.example.module06_module257_module3.ClassAAD param2,
		com.android.example.module06_module257_module1.ClassAAE param3) throws Throwable {
		param0.method0(new io.reactivex.subscribers.TestSubscriber());

		param0.method0(new io.reactivex.subscribers.TestSubscriber());

	}

	public void method4(
		com.android.example.module06_module257_module3.ClassAAF param0) throws Throwable {
		io.reactivex.internal.schedulers.IoScheduler local_var_2_1 = new io.reactivex.internal.schedulers.IoScheduler();
		local_var_2_1.createWorker();

		param0.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

	}
}

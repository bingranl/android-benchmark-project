package com.android.example.module22_module01_module43;

public class ClassAAD {
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_0 = new com.android.example.module01_module39.ClassAAJ();
	private 	com.android.example.module01_module39.ClassAAF instance_var_1_1 = new com.android.example.module01_module39.ClassAAF();
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_2 = new com.android.example.module01_module39.ClassAAJ();
	private 	com.android.example.module01_module39.ClassAAH instance_var_1_3 = new com.android.example.module01_module39.ClassAAH();
	private 	com.android.example.module01_module39.ClassAAH instance_var_1_4 = new com.android.example.module01_module39.ClassAAH();

	public void method0(
		com.android.example.module01_module39.ClassAAJ param0) throws Throwable {
		for (int iAb = 0; iAb < 4; iAb++) {
			if (new java.lang.Object().equals(new java.lang.Object())) {
				java.util.Collections.emptyList().forEach( lambda0 -> {
					try {
						param0.method3(new dagger.internal.DelegateFactory(), new io.reactivex.subscribers.TestSubscriber(), new dagger.internal.DelegateFactory(), new dagger.internal.DelegateFactory());

						io.reactivex.internal.disposables.ListCompositeDisposable local_var_5_0 = new io.reactivex.internal.disposables.ListCompositeDisposable();
						local_var_5_0.isDisposed();

					} catch(Throwable e) { } // ignore
				});
			} else {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.hasSubscription();

			}
			io.reactivex.schedulers.TestScheduler local_var_3_0 = new io.reactivex.schedulers.TestScheduler();
			local_var_3_0.createWorker();

		}
		param0.method3(new dagger.internal.DelegateFactory(), new io.reactivex.subscribers.TestSubscriber(), new dagger.internal.DelegateFactory(), new dagger.internal.DelegateFactory());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.isCancelled();

	}

	public void method1(
		com.android.example.module01_module39.ClassAAA param0,
		com.android.example.module01_module39.ClassAAB param1) throws Throwable {
		param0.method1(new dagger.internal.DelegateFactory());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isCancelled();

		param0.method4(new io.reactivex.subscribers.TestSubscriber(), new dagger.internal.DelegateFactory(), new io.reactivex.subscribers.TestSubscriber());

	}

	public void method2(
		com.android.example.module01_module39.ClassAAE param0) throws Throwable {
		param0.method2(new io.reactivex.subscribers.TestSubscriber(), new dagger.internal.DelegateFactory());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

	}

	public void method3(
		com.android.example.module01_module39.ClassAAC param0,
		com.android.example.module01_module39.ClassAAI param1) throws Throwable {
		param0.method3(new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.hasSubscription();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.hasSubscription();

	}
}

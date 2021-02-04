package com.android.example.module06_module025_module2;

public class ClassAAI {
	private 	io.reactivex.internal.schedulers.IoScheduler instance_var_1_0 = new io.reactivex.internal.schedulers.IoScheduler();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		for (int iAb = 0; iAb < 5; iAb++) {
			java.util.Collections.emptyList().forEach( lambda0 -> {
				try {
					for (int iAc = 0; iAc < 0; iAc++) {
						param0.onError(new java.lang.Throwable());

						io.reactivex.subscribers.TestSubscriber<Object> local_var_5_0 = new io.reactivex.subscribers.TestSubscriber();
						local_var_5_0.isCancelled();

						io.reactivex.subscribers.TestSubscriber<Object> local_var_5_1 = new io.reactivex.subscribers.TestSubscriber();
						local_var_5_1.assertSubscribed();

						io.reactivex.internal.schedulers.SingleScheduler local_var_5_2 = new io.reactivex.internal.schedulers.SingleScheduler();
						local_var_5_2.createWorker();

					}
				} catch(Throwable e) { } // ignore
			});
		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isCancelled();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.internal.schedulers.SingleScheduler param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isDisposed();

		io.reactivex.observers.TestObserver<Object> local_var_2_4 = new io.reactivex.observers.TestObserver();
		local_var_2_4.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.hasSubscription();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.observers.TestObserver<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_4 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_4.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.assertNotSubscribed();

	}
}

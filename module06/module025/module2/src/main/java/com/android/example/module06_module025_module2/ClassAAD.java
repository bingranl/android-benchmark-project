package com.android.example.module06_module025_module2;

public class ClassAAD {
	private 	io.reactivex.internal.schedulers.SingleScheduler instance_var_1_0 = new io.reactivex.internal.schedulers.SingleScheduler();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_3 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_4 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.internal.disposables.ListCompositeDisposable param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1,
		io.reactivex.subscribers.TestSubscriber<Object> param2,
		io.reactivex.subscribers.TestSubscriber<Object> param3) throws Throwable {
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		for (int iAb = 0; iAb < 2; iAb++) {
			io.reactivex.schedulers.TestScheduler local_var_3_0 = new io.reactivex.schedulers.TestScheduler();
			local_var_3_0.createWorker();

			for (int iAc = 0; iAc < 1; iAc++) {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_4_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_4_0.isCancelled();

				local_var_4_0.onError(new java.lang.Throwable());

				local_var_4_0.isDisposed();

			}
		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isDisposed();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		param0.onError(new java.lang.Throwable());

		param0.request(914356586l);

		param0.onNext(new java.lang.Object());

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.internal.disposables.ListCompositeDisposable param1) throws Throwable {
		io.reactivex.schedulers.TestScheduler local_var_2_2 = new io.reactivex.schedulers.TestScheduler();
		local_var_2_2.createWorker();

		param0.hasSubscription();

	}
}

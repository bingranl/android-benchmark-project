package com.android.example.module01_module39;

public class ClassAAG {
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_0 = new dagger.internal.DelegateFactory();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_1 = new io.reactivex.subscribers.TestSubscriber();
	private 	io.reactivex.subscribers.TestSubscriber<Object> instance_var_1_2 = new io.reactivex.subscribers.TestSubscriber();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertSubscribed();

		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		if (new java.lang.Object().equals(new java.lang.Object())) {
			param0.cancel();

		}
	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		dagger.internal.DelegateFactory<Object> param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		io.reactivex.internal.schedulers.SingleScheduler local_var_2_3 = new io.reactivex.internal.schedulers.SingleScheduler();
		local_var_2_3.createWorker();

		param0.dispose();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		param0.assertNotSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_1 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_1.assertNotSubscribed();

	}

	public void method3(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		param0.isCancelled();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.isCancelled();

		io.reactivex.observers.TestObserver<Object> local_var_2_3 = new io.reactivex.observers.TestObserver();
		local_var_2_3.assertSubscribed();

	}

	public void method4(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		dagger.internal.DelegateFactory<Object> param1,
		dagger.internal.DelegateFactory<Object> param2) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.hasSubscription();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.requestMore(-1139131830l);

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_5 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_5.hasSubscription();

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_6 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_6.isDisposed();

	}
}

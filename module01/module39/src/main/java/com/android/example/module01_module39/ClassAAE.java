package com.android.example.module01_module39;

public class ClassAAE {
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_0 = new dagger.internal.DelegateFactory();
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_1 = new dagger.internal.DelegateFactory();

	public void method0(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		io.reactivex.subscribers.TestSubscriber<Object> param1) throws Throwable {
		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_2.isDisposed();

		for (int iAb = 0; iAb < 1; iAb++) {
			dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
			local_var_3_0.get();

			local_var_3_0.get();

		}
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertSubscribed();

	}

	public void method1(
		io.reactivex.subscribers.TestSubscriber<Object> param0) throws Throwable {
		param0.isCancelled();

	}

	public void method2(
		io.reactivex.subscribers.TestSubscriber<Object> param0,
		dagger.internal.DelegateFactory<Object> param1) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_2 = new dagger.internal.DelegateFactory();
		local_var_2_2.get();

		dagger.internal.DelegateFactory<Object> local_var_2_3 = new dagger.internal.DelegateFactory();
		local_var_2_3.get();

		param0.onComplete();

		param0.dispose();

	}
}

package com.android.example.module22_module01_module43;

public class ClassAAE {
	private 	com.android.example.module01_module39.ClassAAH instance_var_1_0 = new com.android.example.module01_module39.ClassAAH();
	private 	com.android.example.module01_module39.ClassAAB instance_var_1_1 = new com.android.example.module01_module39.ClassAAB();
	private 	com.android.example.module01_module39.ClassAAJ instance_var_1_2 = new com.android.example.module01_module39.ClassAAJ();
	private 	com.android.example.module01_module39.ClassAAC instance_var_1_3 = new com.android.example.module01_module39.ClassAAC();

	public void method0(
		com.android.example.module01_module39.ClassAAF param0,
		com.android.example.module01_module39.ClassAAB param1,
		com.android.example.module01_module39.ClassAAG param2) throws Throwable {
	}

	public void method1(
		com.android.example.module01_module39.ClassAAH param0,
		com.android.example.module01_module39.ClassAAE param1) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.requestMore(-1195927213l);

				local_var_3_0.requestMore(-1501611765l);

			} catch(Throwable e) { } // ignore
		});
		param0.method0(new dagger.internal.DelegateFactory());

		io.reactivex.internal.disposables.ListCompositeDisposable local_var_2_2 = new io.reactivex.internal.disposables.ListCompositeDisposable();
		local_var_2_2.isDisposed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.assertNotSubscribed();

	}

	public void method2(
		com.android.example.module01_module39.ClassAAB param0,
		com.android.example.module01_module39.ClassAAJ param1) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_2 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_2.assertSubscribed();

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.isCancelled();

		io.reactivex.observers.TestObserver<Object> local_var_2_4 = new io.reactivex.observers.TestObserver();
		local_var_2_4.isCancelled();

	}
}

package com.android.example.module06_module257_module2;

public class ClassAAA {
	private 	com.android.example.module06_module257_module1.ClassAAG instance_var_1_0 = new com.android.example.module06_module257_module1.ClassAAG();
	private 	com.android.example.module06_module257_module3.ClassAAC instance_var_1_1 = new com.android.example.module06_module257_module3.ClassAAC();
	private 	com.android.example.module06_module257_module3.ClassAAI instance_var_1_2 = new com.android.example.module06_module257_module3.ClassAAI();

	public void method0(
		com.android.example.module06_module257_module1.ClassAAA param0,
		com.android.example.module06_module257_module3.ClassAAG param1,
		com.android.example.module06_module257_module1.ClassAAI param2,
		com.android.example.module06_module257_module3.ClassAAJ param3) throws Throwable {
		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				if (new java.lang.Object().equals(new java.lang.Object())) {
					if (new java.lang.Object().equals(new java.lang.Object())) {
						io.reactivex.internal.disposables.ListCompositeDisposable local_var_5_0 = new io.reactivex.internal.disposables.ListCompositeDisposable();
						local_var_5_0.clear();

					} else {
						io.reactivex.subscribers.TestSubscriber<Object> local_var_5_0 = new io.reactivex.subscribers.TestSubscriber();
						local_var_5_0.onError(new java.lang.Throwable());

					}
				}
				io.reactivex.subscribers.TestSubscriber<Object> local_var_3_0 = new io.reactivex.subscribers.TestSubscriber();
				local_var_3_0.cancel();

			} catch(Throwable e) { } // ignore
		});
	}

	public void method1(
		com.android.example.module06_module257_module3.ClassAAF param0,
		com.android.example.module06_module257_module3.ClassAAJ param1,
		com.android.example.module06_module257_module3.ClassAAE param2) throws Throwable {
		param0.method0(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_3 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_3.onError(new java.lang.Throwable());

		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.assertSubscribed();

		param0.method1(new io.reactivex.subscribers.TestSubscriber(), new io.reactivex.subscribers.TestSubscriber());

	}

	public void method2(
		com.android.example.module06_module257_module3.ClassAAG param0,
		com.android.example.module06_module257_module3.ClassAAJ param1,
		com.android.example.module06_module257_module3.ClassAAC param2,
		com.android.example.module06_module257_module1.ClassAAE param3) throws Throwable {
		io.reactivex.subscribers.TestSubscriber<Object> local_var_2_4 = new io.reactivex.subscribers.TestSubscriber();
		local_var_2_4.requestMore(1296024177l);

	}
}

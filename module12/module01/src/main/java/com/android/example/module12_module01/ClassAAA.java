package com.android.example.module12_module01;

public class ClassAAA {
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_0 = new dagger.internal.DelegateFactory();
	private 	dagger.internal.DelegateFactory<Object> instance_var_1_1 = new dagger.internal.DelegateFactory();

	public void method0(
		dagger.internal.DelegateFactory<Object> param0,
		dagger.internal.DelegateFactory<Object> param1,
		dagger.internal.DelegateFactory<Object> param2) throws Throwable {
	}

	public void method1(
		dagger.internal.DelegateFactory<Object> param0) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

		java.util.Collections.emptyList().forEach( lambda0 -> {
			try {
				param0.get();

				dagger.internal.DelegateFactory<Object> local_var_3_0 = new dagger.internal.DelegateFactory();
				local_var_3_0.get();

			} catch(Throwable e) { } // ignore
		});
	}

	public void method2(
		dagger.internal.DelegateFactory<Object> param0) throws Throwable {
	}

	public void method3(
		dagger.internal.DelegateFactory<Object> param0) throws Throwable {
		dagger.internal.DelegateFactory<Object> local_var_2_1 = new dagger.internal.DelegateFactory();
		local_var_2_1.get();

	}
}

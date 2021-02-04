package com.android.example.module06_module337_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAE = com.android.example.module06_module321_module10.ClassAAE()
		local_var_2_2.method2("SomeString", "SomeString", "SomeString")

		for (iAb in 0..4) {
			param0.assertSubscribed()

			val local_var_3_0: com.android.example.module06_module321_module10.ClassAAB = com.android.example.module06_module321_module10.ClassAAB()
			local_var_3_0.method3("SomeString", "SomeString", "SomeString", "SomeString")

			local_var_3_0.method0("SomeString", "SomeString")

			local_var_3_0.method0("SomeString", "SomeString")

		}
		val local_var_2_3: com.android.example.module06_module114.ClassAAC = com.android.example.module06_module114.ClassAAC()
		local_var_2_3.method1("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAJ = com.android.example.module06_module342_module3.ClassAAJ()
		local_var_2_4.method3("SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.internal.disposables.ListCompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAC = com.android.example.module06_module342_module3.ClassAAC()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.isDisposed()

		param0.clear()

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAF = com.android.example.module06_module342_module3.ClassAAF()
		local_var_2_3.method1("SomeString")

	}
}

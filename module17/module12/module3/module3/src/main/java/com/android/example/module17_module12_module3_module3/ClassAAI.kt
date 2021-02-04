package com.android.example.module17_module12_module3_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()

	fun method0(
		param0: io.reactivex.internal.schedulers.SingleScheduler,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module17_module13_module1.ClassAAD = com.android.example.module17_module13_module1.ClassAAD()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

		for (iAb in 0..2) {
			for (iAc in 0..2) {
				val local_var_4_0: com.android.example.module17_module13_module1.ClassAAE = com.android.example.module17_module13_module1.ClassAAE()
				local_var_4_0.method2("SomeString", "SomeString", "SomeString")

			}
		}
	}

	fun method1(
		param0: io.reactivex.disposables.CompositeDisposable,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module17_module01_module3.ClassAAF = com.android.example.module17_module01_module3.ClassAAF()
		local_var_2_2.method0("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module17_module13_module1.ClassAAC = com.android.example.module17_module13_module1.ClassAAC()
		local_var_2_3.method3("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module17_module01_module3.ClassAAC = com.android.example.module17_module01_module3.ClassAAC()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
	}

	fun method3(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module17_module01_module3.ClassAAA = com.android.example.module17_module01_module3.ClassAAA()
		local_var_2_3.method0("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module17_module13_module1.ClassAAC = com.android.example.module17_module13_module1.ClassAAC()
		local_var_2_4.method1("SomeString")

		val local_var_2_5: com.android.example.module17_module13_module1.ClassAAD = com.android.example.module17_module13_module1.ClassAAD()
		local_var_2_5.method0("SomeString", "SomeString", "SomeString", "SomeString")

		param0.onError(kotlin.Throwable())

	}
}

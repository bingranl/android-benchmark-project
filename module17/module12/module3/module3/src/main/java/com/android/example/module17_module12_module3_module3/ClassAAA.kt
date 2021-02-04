package com.android.example.module17_module12_module3_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module17_module01_module3.ClassAAH = com.android.example.module17_module01_module3.ClassAAH()
		local_var_2_3.method3("SomeString", "SomeString", "SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			for (iAb in 0..2) {
				val local_var_4_0: com.android.example.module17_module13_module1.ClassAAA = com.android.example.module17_module13_module1.ClassAAA()
				local_var_4_0.method0("SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_4: com.android.example.module17_module13_module1.ClassAAJ = com.android.example.module17_module13_module1.ClassAAJ()
		local_var_2_4.method0("SomeString")

		val local_var_2_5: com.android.example.module17_module13_module1.ClassAAD = com.android.example.module17_module13_module1.ClassAAD()
		local_var_2_5.method1("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.disposables.SerialDisposable
	) {
		param0.isCancelled()

		param0.requestMore(-8369895242334761180)

		val local_var_2_2: com.android.example.module17_module13_module1.ClassAAE = com.android.example.module17_module13_module1.ClassAAE()
		local_var_2_2.method1("SomeString")

	}
}

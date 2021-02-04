package com.android.example.module06_module337_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module342_module3.ClassAAE = com.android.example.module06_module342_module3.ClassAAE()
		local_var_2_1.method4("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module321_module10.ClassAAD = com.android.example.module06_module321_module10.ClassAAD()
		local_var_2_2.method1("SomeString")

		listOf("1", "2", "3").forEach {
			param0.onNext(kotlin.Any())

			val local_var_3_0: com.android.example.module06_module342_module3.ClassAAC = com.android.example.module06_module342_module3.ClassAAC()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		}
	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_2: com.android.example.module06_module340_module3.ClassAAH = com.android.example.module06_module340_module3.ClassAAH()
		local_var_2_2.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.android.example.module06_module342_module3.ClassAAA = com.android.example.module06_module342_module3.ClassAAA()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

		param0.assertSubscribed()

		val local_var_2_4: com.android.example.module06_module114.ClassAAD = com.android.example.module06_module114.ClassAAD()
		local_var_2_4.method0("SomeString")

	}
}

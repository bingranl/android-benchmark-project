package com.android.example.module01_module04

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
	private 	val instance_var_1_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_3: io.reactivex.internal.schedulers.IoScheduler = io.reactivex.internal.schedulers.IoScheduler()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_3: com.android.example.module06_module114.ClassAAB = com.android.example.module06_module114.ClassAAB()
		local_var_2_3.method0("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module06_module356_module1.ClassAAJ = com.android.example.module06_module356_module1.ClassAAJ()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module287_module3.ClassAAB = com.android.example.module06_module287_module3.ClassAAB()
			local_var_3_0.method0(com.android.example.module06_module090_module3.ClassAAH())

		}
		param0.isDisposed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module342_module3.ClassAAH = com.android.example.module06_module342_module3.ClassAAH()
		local_var_2_1.method0("SomeString", "SomeString", "SomeString", "SomeString")

	}
}

package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module002_module2.ClassAAI = com.android.example.module06_module002_module2.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module002_module2.ClassAAD = com.android.example.module06_module002_module2.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module002_module5.ClassAAA = com.android.example.module06_module002_module5.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module06_module002_module5.ClassAAJ = com.android.example.module06_module002_module5.ClassAAJ()
	private 	val instance_var_1_4: com.android.example.module06_module002_module5.ClassAAJ = com.android.example.module06_module002_module5.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module002_module2.ClassAAC,
		param1: com.android.example.module06_module002_module5.ClassAAA,
		param2: com.android.example.module06_module002_module2.ClassAAI,
		param3: com.android.example.module06_module002_module5.ClassAAJ
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

		param0.method0(com.android.example.module06_module002_module5.ClassAAF(), com.android.example.module06_module002_module5.ClassAAC())

	}

	fun method1(
		param0: com.android.example.module06_module002_module2.ClassAAC,
		param1: com.android.example.module06_module002_module5.ClassAAB,
		param2: com.android.example.module06_module002_module2.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.dispose()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}

	fun method2(
		param0: com.android.example.module06_module002_module5.ClassAAB,
		param1: com.android.example.module06_module002_module5.ClassAAI,
		param2: com.android.example.module06_module002_module2.ClassAAA
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isCancelled()

	}
}

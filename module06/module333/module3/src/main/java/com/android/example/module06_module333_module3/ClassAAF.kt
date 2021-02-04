package com.android.example.module06_module333_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module333_module2.ClassAAC = com.android.example.module06_module333_module2.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module333_module2.ClassAAH = com.android.example.module06_module333_module2.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module333_module2.ClassAAI = com.android.example.module06_module333_module2.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module333_module5.ClassAAI = com.android.example.module06_module333_module5.ClassAAI()
	private 	val instance_var_1_4: com.android.example.module06_module333_module5.ClassAAI = com.android.example.module06_module333_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module333_module2.ClassAAE,
		param1: com.android.example.module06_module333_module5.ClassAAD
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertNotSubscribed()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module333_module2.ClassAAI,
		param1: com.android.example.module06_module333_module5.ClassAAC,
		param2: com.android.example.module06_module333_module5.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
		local_var_2_3.createWorker()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		param0.method3(com.android.example.module06_module333_module5.ClassAAD())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAE,
		param1: com.android.example.module06_module333_module2.ClassAAB,
		param2: com.android.example.module06_module333_module2.ClassAAB,
		param3: com.android.example.module06_module333_module2.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber())

	}
}

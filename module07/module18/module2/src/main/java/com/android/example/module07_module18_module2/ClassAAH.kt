package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module18_module1.ClassAAH = com.android.example.module07_module18_module1.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module07_module18_module3.ClassAAE = com.android.example.module07_module18_module3.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module07_module18_module3.ClassAAG = com.android.example.module07_module18_module3.ClassAAG()

	fun method0(
		param0: com.android.example.module07_module18_module3.ClassAAB,
		param1: com.android.example.module07_module18_module3.ClassAAA
	) {
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.isCancelled()

		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.cancel()

			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.assertNotSubscribed()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.requestMore(2958088062461803479)

		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

	}

	fun method1(
		param0: com.android.example.module07_module18_module1.ClassAAB,
		param1: com.android.example.module07_module18_module1.ClassAAF,
		param2: com.android.example.module07_module18_module1.ClassAAD,
		param3: com.android.example.module07_module18_module1.ClassAAD
	) {
		param0.method0(com.android.example.module07_module18_module3.ClassAAA(), com.android.example.module07_module18_module3.ClassAAI(), com.android.example.module07_module18_module3.ClassAAC(), com.android.example.module07_module18_module3.ClassAAE())

	}

	fun method2(
		param0: com.android.example.module07_module18_module1.ClassAAG,
		param1: com.android.example.module07_module18_module3.ClassAAD,
		param2: com.android.example.module07_module18_module1.ClassAAI
	) {
		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.start()

		param0.method1(com.android.example.module07_module18_module3.ClassAAI(), com.android.example.module07_module18_module3.ClassAAC(), com.android.example.module07_module18_module3.ClassAAF())

		val local_var_2_4: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_4.createWorker()

	}
}

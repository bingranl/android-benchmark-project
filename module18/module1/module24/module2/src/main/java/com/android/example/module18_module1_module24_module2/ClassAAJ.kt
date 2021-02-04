package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module1.ClassAAB = com.android.example.module18_module1_module24_module1.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module1.ClassAAB = com.android.example.module18_module1_module24_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module1.ClassAAI = com.android.example.module18_module1_module24_module1.ClassAAI()

	fun method0(
		param0: com.android.example.module18_module1_module24_module3.ClassAAC,
		param1: com.android.example.module18_module1_module24_module1.ClassAAA,
		param2: com.android.example.module18_module1_module24_module1.ClassAAA,
		param3: com.android.example.module18_module1_module24_module1.ClassAAA
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
					local_var_5_0.cancel()

				}
			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.dispose()

			}
		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.assertSubscribed()

	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module1.ClassAAE,
		param1: com.android.example.module18_module1_module24_module3.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(4776278786874621121)

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

	}

	fun method2(
		param0: com.android.example.module18_module1_module24_module3.ClassAAI,
		param1: com.android.example.module18_module1_module24_module3.ClassAAH,
		param2: com.android.example.module18_module1_module24_module3.ClassAAB,
		param3: com.android.example.module18_module1_module24_module1.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-6250070604324938824)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

		param0.method1(io.reactivex.observers.TestObserver(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler())

	}

	fun method3(
		param0: com.android.example.module18_module1_module24_module1.ClassAAA,
		param1: com.android.example.module18_module1_module24_module1.ClassAAI
	) {
	}
}

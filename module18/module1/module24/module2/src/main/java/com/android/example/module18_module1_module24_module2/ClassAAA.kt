package com.android.example.module18_module1_module24_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module18_module1_module24_module1.ClassAAJ = com.android.example.module18_module1_module24_module1.ClassAAJ()
	private 	val instance_var_1_1: com.android.example.module18_module1_module24_module3.ClassAAA = com.android.example.module18_module1_module24_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module18_module1_module24_module3.ClassAAE = com.android.example.module18_module1_module24_module3.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module18_module1_module24_module3.ClassAAI = com.android.example.module18_module1_module24_module3.ClassAAI()
	private 	val instance_var_1_4: com.android.example.module18_module1_module24_module1.ClassAAC = com.android.example.module18_module1_module24_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module18_module1_module24_module3.ClassAAG,
		param1: com.android.example.module18_module1_module24_module1.ClassAAB,
		param2: com.android.example.module18_module1_module24_module1.ClassAAJ,
		param3: com.android.example.module18_module1_module24_module1.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module18_module1_module24_module1.ClassAAI
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

			} else {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.requestMore(-4564404019939888703)

			}
		} else {
			val local_var_3_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
			local_var_3_0.assertSubscribed()

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method2(
		param0: com.android.example.module18_module1_module24_module3.ClassAAJ,
		param1: com.android.example.module18_module1_module24_module3.ClassAAC
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

	}

	fun method3(
		param0: com.android.example.module18_module1_module24_module3.ClassAAF
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onError(kotlin.Throwable())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}
}

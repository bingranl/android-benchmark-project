package com.android.example.module06_module027_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module027_module3.ClassAAE = com.android.example.module06_module027_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module027_module1.ClassAAC = com.android.example.module06_module027_module1.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module027_module3.ClassAAD,
		param1: com.android.example.module06_module027_module1.ClassAAJ
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

	}

	fun method1(
		param0: com.android.example.module06_module027_module3.ClassAAA
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

			}
		}
	}

	fun method2(
		param0: com.android.example.module06_module027_module3.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_1.dispose()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

	}

	fun method3(
		param0: com.android.example.module06_module027_module1.ClassAAH
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isCancelled()

		param0.method1(com.android.example.module06_module027_module3.ClassAAH(), com.android.example.module06_module027_module3.ClassAAC(), com.android.example.module06_module027_module3.ClassAAD(), com.android.example.module06_module027_module3.ClassAAC())

	}

	fun method4(
		param0: com.android.example.module06_module027_module1.ClassAAI,
		param1: com.android.example.module06_module027_module1.ClassAAF,
		param2: com.android.example.module06_module027_module1.ClassAAB,
		param3: com.android.example.module06_module027_module1.ClassAAI
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.request(8267349472474614565)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(-110619015180314050)

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.isCancelled()

	}
}

package com.android.example.module07_module18_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module18_module1.ClassAAD = com.android.example.module07_module18_module1.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module07_module18_module3.ClassAAI = com.android.example.module07_module18_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module18_module3.ClassAAI,
		param1: com.android.example.module07_module18_module1.ClassAAI,
		param2: com.android.example.module07_module18_module1.ClassAAG
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.isDisposed()

			}
		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
	}

	fun method1(
		param0: com.android.example.module07_module18_module3.ClassAAF,
		param1: com.android.example.module07_module18_module3.ClassAAG,
		param2: com.android.example.module07_module18_module1.ClassAAB,
		param3: com.android.example.module07_module18_module3.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

	}

	fun method2(
		param0: com.android.example.module07_module18_module3.ClassAAH,
		param1: com.android.example.module07_module18_module3.ClassAAI
	) {
		param0.method1(io.reactivex.internal.disposables.ListCompositeDisposable())

	}

	fun method3(
		param0: com.android.example.module07_module18_module3.ClassAAA,
		param1: com.android.example.module07_module18_module3.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.dispose()

	}
}

package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module2.ClassAAA = com.android.example.module07_module21_module01_module2.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module2.ClassAAH = com.android.example.module07_module21_module01_module2.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module2.ClassAAA = com.android.example.module07_module21_module01_module2.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module5.ClassAAB = com.android.example.module07_module21_module01_module5.ClassAAB()
	private 	val instance_var_1_4: com.android.example.module07_module21_module01_module2.ClassAAA = com.android.example.module07_module21_module01_module2.ClassAAA()

	fun method0(
		param0: com.android.example.module07_module21_module01_module2.ClassAAG,
		param1: com.android.example.module07_module21_module01_module2.ClassAAC,
		param2: com.android.example.module07_module21_module01_module5.ClassAAF
	) {
		for (iAb in 0..5) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.isCancelled()

			} else {
				val local_var_4_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
				local_var_4_0.isDisposed()

			}
		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(5477367938004794385)

		val local_var_2_4: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_4.cancel()

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module2.ClassAAE,
		param1: com.android.example.module07_module21_module01_module2.ClassAAJ,
		param2: com.android.example.module07_module21_module01_module5.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(4489474366167282560)

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.dispose()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module2.ClassAAB
	) {
		param0.method1(com.android.example.module07_module21_module01_module5.ClassAAE(), com.android.example.module07_module21_module01_module5.ClassAAJ())

		param0.method3(com.android.example.module07_module21_module01_module5.ClassAAJ(), com.android.example.module07_module21_module01_module5.ClassAAI())

		param0.method1(com.android.example.module07_module21_module01_module5.ClassAAE(), com.android.example.module07_module21_module01_module5.ClassAAJ())

	}
}

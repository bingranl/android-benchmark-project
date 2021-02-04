package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module2.ClassAAF = com.android.example.module07_module21_module01_module2.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module2.ClassAAI = com.android.example.module07_module21_module01_module2.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAE = com.android.example.module07_module21_module01_module5.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module21_module01_module5.ClassAAA,
		param1: com.android.example.module07_module21_module01_module2.ClassAAE
	) {
		for (iAb in 0..3) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

			val local_var_3_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
			local_var_3_1.isDisposed()

			local_var_3_0.isCancelled()

		}
		val local_var_2_2: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAC,
		param1: com.android.example.module07_module21_module01_module5.ClassAAB,
		param2: com.android.example.module07_module21_module01_module5.ClassAAB,
		param3: com.android.example.module07_module21_module01_module5.ClassAAI
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.cancel()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module2.ClassAAI,
		param1: com.android.example.module07_module21_module01_module5.ClassAAF,
		param2: com.android.example.module07_module21_module01_module2.ClassAAG,
		param3: com.android.example.module07_module21_module01_module2.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(2464324119584869059)

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onComplete()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.dispose()

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module2.ClassAAF,
		param1: com.android.example.module07_module21_module01_module2.ClassAAG,
		param2: com.android.example.module07_module21_module01_module2.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-6852247515783905960)

	}

	fun method4(
		param0: com.android.example.module07_module21_module01_module5.ClassAAJ,
		param1: com.android.example.module07_module21_module01_module5.ClassAAE,
		param2: com.android.example.module07_module21_module01_module5.ClassAAG,
		param3: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_4: io.reactivex.internal.util.OpenHashSet<kotlin.Any> = io.reactivex.internal.util.OpenHashSet()
		local_var_2_4.keys()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(2387052764061353003)

	}
}

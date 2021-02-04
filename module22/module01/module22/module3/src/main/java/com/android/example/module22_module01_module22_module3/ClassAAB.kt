package com.android.example.module22_module01_module22_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAB {
	private 	val instance_var_1_0: com.android.example.module06_module257_module3.ClassAAB = com.android.example.module06_module257_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module257_module3.ClassAAA = com.android.example.module06_module257_module3.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module257_module3.ClassAAE = com.android.example.module06_module257_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module257_module3.ClassAAG,
		param1: com.android.example.module06_module257_module3.ClassAAJ,
		param2: com.android.example.module06_module257_module3.ClassAAD,
		param3: com.android.example.module06_module257_module3.ClassAAD
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		if (kotlin.Any().equals(kotlin.Any())) {
			for (iAb in 0..0) {
				param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.cancel()

			}
		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isDisposed()

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module257_module3.ClassAAI,
		param1: com.android.example.module06_module257_module3.ClassAAG
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable())

	}

	fun method2(
		param0: com.android.example.module06_module257_module3.ClassAAE,
		param1: com.android.example.module06_module257_module3.ClassAAG,
		param2: com.android.example.module06_module257_module3.ClassAAF
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module06_module257_module3.ClassAAF,
		param1: com.android.example.module06_module257_module3.ClassAAI,
		param2: com.android.example.module06_module257_module3.ClassAAF,
		param3: com.android.example.module06_module257_module3.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: com.android.example.module06_module257_module3.ClassAAB,
		param1: com.android.example.module06_module257_module3.ClassAAB,
		param2: com.android.example.module06_module257_module3.ClassAAA
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

	}
}

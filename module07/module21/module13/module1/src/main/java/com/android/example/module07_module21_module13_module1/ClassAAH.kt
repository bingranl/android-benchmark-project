package com.android.example.module07_module21_module13_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module21_module13_module5.ClassAAC = com.android.example.module07_module21_module13_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module07_module21_module13_module5.ClassAAI = com.android.example.module07_module21_module13_module5.ClassAAI()

	fun method0(
		param0: com.android.example.module07_module21_module13_module5.ClassAAF,
		param1: com.android.example.module07_module21_module13_module5.ClassAAE,
		param2: com.android.example.module07_module21_module13_module5.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

		for (iAb in 0..0) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.request(4908060074332519506)

			val local_var_3_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_1.isDisposed()

			val local_var_3_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_2.isDisposed()

		}
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

	}

	fun method1(
		param0: com.android.example.module07_module21_module13_module5.ClassAAB,
		param1: com.android.example.module07_module21_module13_module5.ClassAAA,
		param2: com.android.example.module07_module21_module13_module5.ClassAAF
	) {
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_4.shutdown()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

	}

	fun method2(
		param0: com.android.example.module07_module21_module13_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(9080736410102034246)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}
}

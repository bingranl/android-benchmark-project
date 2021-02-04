package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAH = com.android.example.module06_module333_module5.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAH = com.android.example.module06_module333_module5.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module333_module5.ClassAAE = com.android.example.module06_module333_module5.ClassAAE()
	private 	val instance_var_1_3: com.android.example.module06_module333_module5.ClassAAD = com.android.example.module06_module333_module5.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAJ,
		param1: com.android.example.module06_module333_module5.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..2) {
				if (kotlin.Any().equals(kotlin.Any())) {
					param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

				}
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.hasSubscription()

				val local_var_4_1: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
				local_var_4_1.isDisposed()

			}
		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAE,
		param1: com.android.example.module06_module333_module5.ClassAAI
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAF
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

	}
}

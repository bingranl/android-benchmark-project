package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module284_module5.ClassAAI = com.android.example.module06_module284_module5.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module284_module5.ClassAAJ = com.android.example.module06_module284_module5.ClassAAJ()
	private 	val instance_var_1_2: com.android.example.module06_module284_module2.ClassAAE = com.android.example.module06_module284_module2.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module284_module5.ClassAAC
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		listOf("1", "2", "3").forEach {
			for (iAb in 0..0) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.isCancelled()

				val local_var_4_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_1.dispose()

			}
			param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler(), io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(7952843864257707369)

	}

	fun method1(
		param0: com.android.example.module06_module284_module2.ClassAAI,
		param1: com.android.example.module06_module284_module5.ClassAAE,
		param2: com.android.example.module06_module284_module5.ClassAAB,
		param3: com.android.example.module06_module284_module5.ClassAAB
	) {
	}

	fun method2(
		param0: com.android.example.module06_module284_module2.ClassAAD,
		param1: com.android.example.module06_module284_module5.ClassAAF,
		param2: com.android.example.module06_module284_module5.ClassAAG,
		param3: com.android.example.module06_module284_module2.ClassAAI
	) {
		val local_var_2_4: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(81)
		local_var_2_4.toString()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.isDisposed()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.hasSubscription()

	}

	fun method3(
		param0: com.android.example.module06_module284_module5.ClassAAH
	) {
		val local_var_2_1: io.reactivex.internal.schedulers.ComputationScheduler = io.reactivex.internal.schedulers.ComputationScheduler()
		local_var_2_1.start()

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.subscribers.TestSubscriber())

	}
}

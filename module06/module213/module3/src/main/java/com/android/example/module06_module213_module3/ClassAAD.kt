package com.android.example.module06_module213_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAI = com.android.example.module06_module109_module1.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module213_module2.ClassAAF = com.android.example.module06_module213_module2.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAG,
		param1: com.android.example.module06_module109_module1.ClassAAA
	) {
		for (iAb in 0..1) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

			for (iAc in 0..4) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.isDisposed()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.onError(kotlin.Throwable())

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.isCancelled()

			}
			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onComplete()

		}
	}

	fun method1(
		param0: com.android.example.module06_module213_module2.ClassAAJ,
		param1: com.android.example.module06_module213_module5.ClassAAG,
		param2: com.android.example.module06_module213_module2.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

	}

	fun method2(
		param0: com.android.example.module06_module213_module5.ClassAAJ
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_1.triggerActions()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.hasSubscription()

		val local_var_2_3: io.reactivex.internal.util.LinkedArrayList = io.reactivex.internal.util.LinkedArrayList(5)
		local_var_2_3.head()

	}

	fun method3(
		param0: com.android.example.module06_module109_module1.ClassAAC,
		param1: com.android.example.module06_module109_module1.ClassAAE,
		param2: com.android.example.module06_module213_module2.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}

	fun method4(
		param0: com.android.example.module06_module109_module1.ClassAAD,
		param1: com.android.example.module06_module109_module1.ClassAAC
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

	}
}

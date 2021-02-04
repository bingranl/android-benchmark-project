package com.android.example.module06_module213_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module213_module5.ClassAAF = com.android.example.module06_module213_module5.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module213_module2.ClassAAF = com.android.example.module06_module213_module2.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module213_module2.ClassAAG
	) {
		val local_var_2_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_1.triggerActions()

	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAB
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.dispose()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.isDisposed()

	}

	fun method2(
		param0: com.android.example.module06_module213_module2.ClassAAI,
		param1: com.android.example.module06_module213_module2.ClassAAD,
		param2: com.android.example.module06_module213_module5.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(-1386362830898677304)

	}

	fun method3(
		param0: com.android.example.module06_module213_module5.ClassAAG,
		param1: com.android.example.module06_module213_module2.ClassAAH,
		param2: com.android.example.module06_module213_module5.ClassAAI,
		param3: com.android.example.module06_module109_module1.ClassAAJ
	) {
		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

	}
}

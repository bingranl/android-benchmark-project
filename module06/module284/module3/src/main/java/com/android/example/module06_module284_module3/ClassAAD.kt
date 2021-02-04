package com.android.example.module06_module284_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module284_module5.ClassAAC = com.android.example.module06_module284_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module284_module2.ClassAAD = com.android.example.module06_module284_module2.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module284_module5.ClassAAC = com.android.example.module06_module284_module5.ClassAAC()
	private 	val instance_var_1_3: com.android.example.module06_module284_module5.ClassAAC = com.android.example.module06_module284_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module284_module2.ClassAAJ,
		param1: com.android.example.module06_module284_module5.ClassAAI,
		param2: com.android.example.module06_module284_module5.ClassAAF,
		param3: com.android.example.module06_module284_module2.ClassAAF
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.clear()

			}
		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

		}
		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.assertSubscribed()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.dispose()

	}

	fun method1(
		param0: com.android.example.module06_module284_module5.ClassAAH,
		param1: com.android.example.module06_module284_module5.ClassAAJ
	) {
	}

	fun method2(
		param0: com.android.example.module06_module284_module5.ClassAAH,
		param1: com.android.example.module06_module284_module2.ClassAAE,
		param2: com.android.example.module06_module284_module2.ClassAAG
	) {
		param0.method3(io.reactivex.subscribers.TestSubscriber())

	}

	fun method3(
		param0: com.android.example.module06_module284_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_1.shutdown()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(4574373143371199271)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

		param0.method0(io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: com.android.example.module06_module284_module5.ClassAAJ,
		param1: com.android.example.module06_module284_module5.ClassAAI,
		param2: com.android.example.module06_module284_module2.ClassAAB,
		param3: com.android.example.module06_module284_module2.ClassAAH
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-6467186231062054885)

		val local_var_2_5: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_5.shutdown()

		val local_var_2_6: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_6.request(-4634374332051522319)

		val local_var_2_7: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_7.isCancelled()

	}
}

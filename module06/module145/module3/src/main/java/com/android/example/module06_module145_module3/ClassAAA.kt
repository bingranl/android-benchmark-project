package com.android.example.module06_module145_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAH = com.android.example.module06_module145_module6.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAA = com.android.example.module06_module145_module6.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module145_module6.ClassAAB = com.android.example.module06_module145_module6.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module145_module6.ClassAAE,
		param1: com.android.example.module06_module145_module6.ClassAAA
	) {
		for (iAb in 0..5) {
			param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		}
		for (iAc in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.requestMore(-3944177335876193530)

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.hasSubscription()

			val local_var_3_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_3.request(-4230086215607340401)

		}
	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAD,
		param1: com.android.example.module06_module145_module6.ClassAAE,
		param2: com.android.example.module06_module145_module6.ClassAAH,
		param3: com.android.example.module06_module145_module6.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		param0.method2(io.reactivex.internal.disposables.ListCompositeDisposable())

		param0.method2(io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_5: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_5.get()

	}

	fun method2(
		param0: com.android.example.module06_module145_module6.ClassAAB,
		param1: com.android.example.module06_module145_module6.ClassAAH
	) {
		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.dispose()

		val local_var_2_3: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
		local_var_2_3.start()

	}

	fun method3(
		param0: com.android.example.module06_module145_module6.ClassAAE,
		param1: com.android.example.module06_module145_module6.ClassAAJ,
		param2: com.android.example.module06_module145_module6.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isDisposed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.cancel()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.hasSubscription()

	}
}

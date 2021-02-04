package com.android.example.module06_module333_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module06_module333_module5.ClassAAC = com.android.example.module06_module333_module5.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module333_module5.ClassAAE = com.android.example.module06_module333_module5.ClassAAE()
	private 	val instance_var_1_2: com.android.example.module06_module333_module5.ClassAAB = com.android.example.module06_module333_module5.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module333_module5.ClassAAC = com.android.example.module06_module333_module5.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module333_module5.ClassAAJ,
		param1: com.android.example.module06_module333_module5.ClassAAE
	) {
		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		for (iAb in 0..3) {
			for (iAc in 0..4) {
				val local_var_4_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
				local_var_4_0.createWorker()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.hasSubscription()

				val local_var_4_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_2.request(4685851861237616842)

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

		}
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.schedulers.SingleScheduler())

	}

	fun method1(
		param0: com.android.example.module06_module333_module5.ClassAAI
	) {
	}

	fun method2(
		param0: com.android.example.module06_module333_module5.ClassAAD,
		param1: com.android.example.module06_module333_module5.ClassAAE,
		param2: com.android.example.module06_module333_module5.ClassAAB,
		param3: com.android.example.module06_module333_module5.ClassAAA
	) {
		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onNext(kotlin.Any())

	}
}

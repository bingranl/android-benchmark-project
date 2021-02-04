package com.android.example.module02_module37_module02_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: com.android.example.module02_module37_module02_module3.ClassAAC = com.android.example.module02_module37_module02_module3.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module02_module37_module02_module3.ClassAAF = com.android.example.module02_module37_module02_module3.ClassAAF()
	private 	val instance_var_1_2: com.android.example.module02_module37_module02_module3.ClassAAI = com.android.example.module02_module37_module02_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module02_module37_module02_module1.ClassAAE,
		param1: com.android.example.module02_module37_module02_module1.ClassAAD,
		param2: com.android.example.module02_module37_module02_module3.ClassAAF
	) {
		for (iAb in 0..5) {
			if (kotlin.Any().equals(kotlin.Any())) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.internal.schedulers.SingleScheduler = io.reactivex.internal.schedulers.SingleScheduler()
					local_var_5_0.createWorker()

				} else {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

				}
			} else {
				val local_var_4_0: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
				local_var_4_0.dispose()

			}
		}
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isCancelled()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(8892343350945209453)

	}

	fun method1(
		param0: com.android.example.module02_module37_module02_module1.ClassAAH,
		param1: com.android.example.module02_module37_module02_module3.ClassAAA,
		param2: com.android.example.module02_module37_module02_module3.ClassAAF
	) {
		param0.method0(com.android.example.module02_module37_module02_module3.ClassAAD(), com.android.example.module02_module37_module02_module3.ClassAAG(), com.android.example.module02_module37_module02_module3.ClassAAA(), com.android.example.module02_module37_module02_module3.ClassAAC())

		val local_var_2_3: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_3.createWorker()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

	}
}

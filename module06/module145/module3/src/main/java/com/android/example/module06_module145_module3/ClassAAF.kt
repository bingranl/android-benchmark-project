package com.android.example.module06_module145_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAI = com.android.example.module06_module145_module6.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAF = com.android.example.module06_module145_module6.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module145_module6.ClassAAA,
		param1: com.android.example.module06_module145_module6.ClassAAJ,
		param2: com.android.example.module06_module145_module6.ClassAAB,
		param3: com.android.example.module06_module145_module6.ClassAAC
	) {
	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAB,
		param1: com.android.example.module06_module145_module6.ClassAAJ,
		param2: com.android.example.module06_module145_module6.ClassAAI,
		param3: com.android.example.module06_module145_module6.ClassAAJ
	) {
		for (iAb in 0..5) {
			for (iAc in 0..6) {
				for (iAd in 0..1) {
					param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.requestMore(4359722850598985050)

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.onError(kotlin.Throwable())

					val local_var_5_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_2.onComplete()

				}
				param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

				val local_var_4_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
				local_var_4_0.createWorker()

				val local_var_4_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_1.isDisposed()

			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onComplete()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.assertNotSubscribed()

		}
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}
}

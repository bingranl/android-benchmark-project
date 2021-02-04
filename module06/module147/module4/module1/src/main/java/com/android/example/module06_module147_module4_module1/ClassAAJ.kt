package com.android.example.module06_module147_module4_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAH = com.android.example.module06_module147_module4_module6.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAJ = com.android.example.module06_module147_module4_module6.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH,
		param1: com.android.example.module06_module109_module1.ClassAAA,
		param2: com.android.example.module06_module147_module4_module6.ClassAAC
	) {
		for (iAb in 0..2) {
			for (iAc in 0..4) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.isDisposed()

				} else {
					param0.method3(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

				}
			}
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.dispose()

			local_var_3_0.assertSubscribed()

		}
		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.clear()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAG,
		param1: com.android.example.module06_module147_module4_module6.ClassAAI,
		param2: com.android.example.module06_module109_module1.ClassAAI
	) {
		param0.method1("SomeString")

		val local_var_2_3: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_3.onSuccess(kotlin.Any())

		val local_var_2_4: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_4.offer(kotlin.Any())

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAC,
		param1: com.android.example.module06_module147_module4_module6.ClassAAF,
		param2: com.android.example.module06_module109_module1.ClassAAJ,
		param3: com.android.example.module06_module147_module4_module6.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAD
	) {
		val local_var_2_1: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_1.createWorker()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method4(
		param0: com.android.example.module06_module109_module1.ClassAAJ
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.cancel()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}
}

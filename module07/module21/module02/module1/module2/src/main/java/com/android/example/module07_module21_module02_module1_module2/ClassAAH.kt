package com.android.example.module07_module21_module02_module1_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module21_module02_module1_module5.ClassAAA = com.android.example.module07_module21_module02_module1_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module21_module02_module1_module1.ClassAAA = com.android.example.module07_module21_module02_module1_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module07_module21_module02_module1_module5.ClassAAE = com.android.example.module07_module21_module02_module1_module5.ClassAAE()

	fun method0(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param1: com.android.example.module07_module21_module02_module1_module1.ClassAAB
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.hasSubscription()

		} else {
			for (iAb in 0..4) {
				val local_var_4_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
				local_var_4_0.triggerActions()

			}
		}
	}

	fun method1(
		param0: com.android.example.module07_module21_module02_module1_module1.ClassAAG,
		param1: com.android.example.module07_module21_module02_module1_module1.ClassAAI,
		param2: com.android.example.module07_module21_module02_module1_module1.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.disposables.SerialDisposable = io.reactivex.disposables.SerialDisposable()
		local_var_2_5.get()

		param0.method1(com.android.example.module07_module21_module02_module1_module5.ClassAAH(), com.android.example.module07_module21_module02_module1_module5.ClassAAA())

	}

	fun method2(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAB,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAF
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(5429164722563464453)

		val local_var_2_3: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_3.dispose()

	}

	fun method3(
		param0: com.android.example.module07_module21_module02_module1_module5.ClassAAF,
		param1: com.android.example.module07_module21_module02_module1_module5.ClassAAD,
		param2: com.android.example.module07_module21_module02_module1_module1.ClassAAC,
		param3: com.android.example.module07_module21_module02_module1_module5.ClassAAC
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onError(kotlin.Throwable())

		param0.method0(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}
}

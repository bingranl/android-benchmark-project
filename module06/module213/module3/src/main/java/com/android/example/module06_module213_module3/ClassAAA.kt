package com.android.example.module06_module213_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAG = com.android.example.module06_module109_module1.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module213_module5.ClassAAA = com.android.example.module06_module213_module5.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module213_module2.ClassAAB = com.android.example.module06_module213_module2.ClassAAB()
	private 	val instance_var_1_3: com.android.example.module06_module109_module1.ClassAAG = com.android.example.module06_module109_module1.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module213_module5.ClassAAH,
		param1: com.android.example.module06_module109_module1.ClassAAI,
		param2: com.android.example.module06_module109_module1.ClassAAE
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			if (kotlin.Any().equals(kotlin.Any())) {
				for (iAb in 0..0) {
					val local_var_5_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_0.dispose()

					val local_var_5_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_1.hasSubscription()

					val local_var_5_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
					local_var_5_2.assertSubscribed()

					local_var_5_0.isCancelled()

				}
			} else {
				val local_var_4_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
				local_var_4_0.isCancelled()

			}
		}
	}

	fun method1(
		param0: com.android.example.module06_module213_module5.ClassAAI
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.hasSubscription()

		val local_var_2_2: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_2.isDisposed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAH,
		param1: com.android.example.module06_module109_module1.ClassAAE,
		param2: com.android.example.module06_module109_module1.ClassAAC
	) {
		val local_var_2_3: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_3.triggerActions()

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.isDisposed()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.onNext(kotlin.Any())

		val local_var_2_6: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_6.triggerActions()

	}

	fun method3(
		param0: com.android.example.module06_module213_module2.ClassAAI,
		param1: com.android.example.module06_module213_module2.ClassAAC,
		param2: com.android.example.module06_module213_module5.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onNext(kotlin.Any())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

	}
}

package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module2.ClassAAH = com.android.example.module07_module21_module01_module2.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module2.ClassAAC = com.android.example.module07_module21_module01_module2.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module07_module21_module01_module5.ClassAAH = com.android.example.module07_module21_module01_module5.ClassAAH()
	private 	val instance_var_1_3: com.android.example.module07_module21_module01_module2.ClassAAC = com.android.example.module07_module21_module01_module2.ClassAAC()

	fun method0(
		param0: com.android.example.module07_module21_module01_module2.ClassAAB,
		param1: com.android.example.module07_module21_module01_module5.ClassAAG,
		param2: com.android.example.module07_module21_module01_module2.ClassAAC,
		param3: com.android.example.module07_module21_module01_module5.ClassAAC
	) {
		param0.method0(com.android.example.module07_module21_module01_module5.ClassAAF())

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.hasSubscription()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
			local_var_3_0.onError(kotlin.Throwable())

		} else {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.cancel()

		}
	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAF,
		param1: com.android.example.module07_module21_module01_module2.ClassAAE,
		param2: com.android.example.module07_module21_module01_module2.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.hasSubscription()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module2.ClassAAG,
		param1: com.android.example.module07_module21_module01_module2.ClassAAG,
		param2: com.android.example.module07_module21_module01_module2.ClassAAD
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-3729660702878883759)

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.dispose()

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.requestMore(-6939052136867298397)

		val local_var_2_6: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_6.triggerActions()

	}
}

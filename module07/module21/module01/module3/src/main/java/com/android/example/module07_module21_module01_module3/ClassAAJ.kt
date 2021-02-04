package com.android.example.module07_module21_module01_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module07_module21_module01_module5.ClassAAA = com.android.example.module07_module21_module01_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module07_module21_module01_module5.ClassAAG = com.android.example.module07_module21_module01_module5.ClassAAG()

	fun method0(
		param0: com.android.example.module07_module21_module01_module2.ClassAAH,
		param1: com.android.example.module07_module21_module01_module2.ClassAAJ,
		param2: com.android.example.module07_module21_module01_module5.ClassAAI
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.request(-2110036784283710145)

		val local_var_2_4: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
		local_var_2_4.clear()

		for (iAb in 0..2) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.isCancelled()

			val local_var_3_1: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
			local_var_3_1.isDisposed()

			val local_var_3_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_2.cancel()

		}
	}

	fun method1(
		param0: com.android.example.module07_module21_module01_module5.ClassAAE,
		param1: com.android.example.module07_module21_module01_module5.ClassAAD,
		param2: com.android.example.module07_module21_module01_module2.ClassAAG
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onComplete()

	}

	fun method2(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG,
		param1: com.android.example.module07_module21_module01_module2.ClassAAI,
		param2: com.android.example.module07_module21_module01_module2.ClassAAF,
		param3: com.android.example.module07_module21_module01_module5.ClassAAC
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		param0.method2(io.reactivex.subscribers.TestSubscriber(), io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_5: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_5.request(424565085598957459)

	}

	fun method3(
		param0: com.android.example.module07_module21_module01_module5.ClassAAG
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.assertSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}
}
